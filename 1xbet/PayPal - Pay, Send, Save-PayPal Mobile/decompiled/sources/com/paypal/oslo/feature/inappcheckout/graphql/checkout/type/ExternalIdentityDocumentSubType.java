package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentSubType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SSN", "ITIN", "TIN", "NONE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalIdentityDocumentSubType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType ITIN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType NONE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType SSN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType TIN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalIdentityDocumentSubType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType externalIdentityDocumentSubType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType("SSN", 0, "SSN");
        SSN = externalIdentityDocumentSubType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType externalIdentityDocumentSubType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType("ITIN", 1, "ITIN");
        ITIN = externalIdentityDocumentSubType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType externalIdentityDocumentSubType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType("TIN", 2, "TIN");
        TIN = externalIdentityDocumentSubType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType externalIdentityDocumentSubType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType("NONE", 3, "NONE");
        NONE = externalIdentityDocumentSubType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType externalIdentityDocumentSubType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = externalIdentityDocumentSubType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[] externalIdentityDocumentSubTypeArr = {externalIdentityDocumentSubType, externalIdentityDocumentSubType2, externalIdentityDocumentSubType3, externalIdentityDocumentSubType4, externalIdentityDocumentSubType5};
        getHighSpeedVideoFpsRangesFor = externalIdentityDocumentSubTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(externalIdentityDocumentSubTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalIdentityDocumentSubType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SSN", "ITIN", "TIN", "NONE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentSubType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentSubType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentSubType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentSubType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.SSN, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.ITIN, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.TIN, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.NONE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType externalIdentityDocumentSubType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType) obj;
            return externalIdentityDocumentSubType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.UNKNOWN__ : externalIdentityDocumentSubType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentSubType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
