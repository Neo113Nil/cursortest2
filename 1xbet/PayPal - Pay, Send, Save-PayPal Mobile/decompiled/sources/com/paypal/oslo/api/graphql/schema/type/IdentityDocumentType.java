package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "NATIONAL_ID", "PASSPORT_NUMBER", "DRIVERS_LICENSE", "TAX_IDENTIFICATION_NUMBER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IdentityDocumentType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType DRIVERS_LICENSE;
    public static final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType NATIONAL_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType PASSPORT_NUMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType TAX_IDENTIFICATION_NUMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private IdentityDocumentType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType = new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType("NATIONAL_ID", 0, "NATIONAL_ID");
        NATIONAL_ID = identityDocumentType;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType2 = new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType("PASSPORT_NUMBER", 1, "PASSPORT_NUMBER");
        PASSPORT_NUMBER = identityDocumentType2;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType3 = new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType("DRIVERS_LICENSE", 2, "DRIVERS_LICENSE");
        DRIVERS_LICENSE = identityDocumentType3;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType4 = new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType("TAX_IDENTIFICATION_NUMBER", 3, "TAX_IDENTIFICATION_NUMBER");
        TAX_IDENTIFICATION_NUMBER = identityDocumentType4;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType5 = new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = identityDocumentType5;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[] identityDocumentTypeArr = {identityDocumentType, identityDocumentType2, identityDocumentType3, identityDocumentType4, identityDocumentType5};
        getHighSpeedVideoFpsRangesFor = identityDocumentTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(identityDocumentTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("IdentityDocumentType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NATIONAL_ID", "PASSPORT_NUMBER", "DRIVERS_LICENSE", "TAX_IDENTIFICATION_NUMBER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[]{com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.NATIONAL_ID, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.PASSPORT_NUMBER, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.DRIVERS_LICENSE, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType = (com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType) obj;
            return identityDocumentType == null ? com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.UNKNOWN__ : identityDocumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
