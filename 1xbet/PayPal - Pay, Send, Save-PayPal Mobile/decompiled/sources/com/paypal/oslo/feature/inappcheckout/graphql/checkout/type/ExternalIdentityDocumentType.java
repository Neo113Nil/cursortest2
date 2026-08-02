package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CPF", "CNPJ", "DRIVERS_LICENSE", "NATIONAL_ID", "PASSPORT_NUMBER", "TAX_IDENTIFICATION_NUMBER", "TEMPORARY_NATIONAL_ID", "IMMIGRATION_ID", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalIdentityDocumentType {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType CNPJ;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType CPF;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType DRIVERS_LICENSE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType IMMIGRATION_ID;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType NATIONAL_ID;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType PASSPORT_NUMBER;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType TAX_IDENTIFICATION_NUMBER;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType TEMPORARY_NATIONAL_ID;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalIdentityDocumentType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("CPF", 0, "CPF");
        CPF = externalIdentityDocumentType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("CNPJ", 1, "CNPJ");
        CNPJ = externalIdentityDocumentType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("DRIVERS_LICENSE", 2, "DRIVERS_LICENSE");
        DRIVERS_LICENSE = externalIdentityDocumentType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("NATIONAL_ID", 3, "NATIONAL_ID");
        NATIONAL_ID = externalIdentityDocumentType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("PASSPORT_NUMBER", 4, "PASSPORT_NUMBER");
        PASSPORT_NUMBER = externalIdentityDocumentType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("TAX_IDENTIFICATION_NUMBER", 5, "TAX_IDENTIFICATION_NUMBER");
        TAX_IDENTIFICATION_NUMBER = externalIdentityDocumentType6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("TEMPORARY_NATIONAL_ID", 6, "TEMPORARY_NATIONAL_ID");
        TEMPORARY_NATIONAL_ID = externalIdentityDocumentType7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("IMMIGRATION_ID", 7, "IMMIGRATION_ID");
        IMMIGRATION_ID = externalIdentityDocumentType8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = externalIdentityDocumentType9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[] externalIdentityDocumentTypeArr = {externalIdentityDocumentType, externalIdentityDocumentType2, externalIdentityDocumentType3, externalIdentityDocumentType4, externalIdentityDocumentType5, externalIdentityDocumentType6, externalIdentityDocumentType7, externalIdentityDocumentType8, externalIdentityDocumentType9};
        getHighSpeedVideoFpsRangesFor = externalIdentityDocumentTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(externalIdentityDocumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalIdentityDocumentType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CPF", "CNPJ", "DRIVERS_LICENSE", "NATIONAL_ID", "PASSPORT_NUMBER", "TAX_IDENTIFICATION_NUMBER", "TEMPORARY_NATIONAL_ID", "IMMIGRATION_ID"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalIdentityDocumentType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.CPF, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.CNPJ, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.DRIVERS_LICENSE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.NATIONAL_ID, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.PASSPORT_NUMBER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.TAX_IDENTIFICATION_NUMBER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.TEMPORARY_NATIONAL_ID, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.IMMIGRATION_ID});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType externalIdentityDocumentType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType) obj;
            return externalIdentityDocumentType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.UNKNOWN__ : externalIdentityDocumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalIdentityDocumentType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
