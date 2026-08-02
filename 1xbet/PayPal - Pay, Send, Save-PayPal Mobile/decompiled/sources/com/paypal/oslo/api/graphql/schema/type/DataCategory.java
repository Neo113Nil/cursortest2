package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DataCategory;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CONSUMER_PERSONAL", "BUSINESS_PERSONAL", "BUSINESS_COMPANY", "EMPLOYEE_PERSONAL", "PAYPAL_COMPANY", "INTRINSIC", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DataCategory {
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory BUSINESS_COMPANY;
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory BUSINESS_PERSONAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory CONSUMER_PERSONAL;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DataCategory[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory EMPLOYEE_PERSONAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory INTRINSIC;
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory PAYPAL_COMPANY;
    public static final com.paypal.oslo.api.graphql.schema.type.DataCategory UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DataCategory(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory = new com.paypal.oslo.api.graphql.schema.type.DataCategory("CONSUMER_PERSONAL", 0, "CONSUMER_PERSONAL");
        CONSUMER_PERSONAL = dataCategory;
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory2 = new com.paypal.oslo.api.graphql.schema.type.DataCategory("BUSINESS_PERSONAL", 1, "BUSINESS_PERSONAL");
        BUSINESS_PERSONAL = dataCategory2;
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory3 = new com.paypal.oslo.api.graphql.schema.type.DataCategory("BUSINESS_COMPANY", 2, "BUSINESS_COMPANY");
        BUSINESS_COMPANY = dataCategory3;
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory4 = new com.paypal.oslo.api.graphql.schema.type.DataCategory("EMPLOYEE_PERSONAL", 3, "EMPLOYEE_PERSONAL");
        EMPLOYEE_PERSONAL = dataCategory4;
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory5 = new com.paypal.oslo.api.graphql.schema.type.DataCategory("PAYPAL_COMPANY", 4, "PAYPAL_COMPANY");
        PAYPAL_COMPANY = dataCategory5;
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory6 = new com.paypal.oslo.api.graphql.schema.type.DataCategory("INTRINSIC", 5, "INTRINSIC");
        INTRINSIC = dataCategory6;
        com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory7 = new com.paypal.oslo.api.graphql.schema.type.DataCategory("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = dataCategory7;
        com.paypal.oslo.api.graphql.schema.type.DataCategory[] dataCategoryArr = {dataCategory, dataCategory2, dataCategory3, dataCategory4, dataCategory5, dataCategory6, dataCategory7};
        Camera2StreamConfigurationMap = dataCategoryArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(dataCategoryArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DataCategory.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DataCategory", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CONSUMER_PERSONAL", "BUSINESS_PERSONAL", "BUSINESS_COMPANY", "EMPLOYEE_PERSONAL", "PAYPAL_COMPANY", "INTRINSIC"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DataCategory$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DataCategory;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DataCategory;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DataCategory;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DataCategory.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DataCategory> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DataCategory[]{com.paypal.oslo.api.graphql.schema.type.DataCategory.CONSUMER_PERSONAL, com.paypal.oslo.api.graphql.schema.type.DataCategory.BUSINESS_PERSONAL, com.paypal.oslo.api.graphql.schema.type.DataCategory.BUSINESS_COMPANY, com.paypal.oslo.api.graphql.schema.type.DataCategory.EMPLOYEE_PERSONAL, com.paypal.oslo.api.graphql.schema.type.DataCategory.PAYPAL_COMPANY, com.paypal.oslo.api.graphql.schema.type.DataCategory.INTRINSIC});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DataCategory[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DataCategory[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DataCategory[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DataCategory safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DataCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DataCategory) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DataCategory dataCategory = (com.paypal.oslo.api.graphql.schema.type.DataCategory) obj;
            return dataCategory == null ? com.paypal.oslo.api.graphql.schema.type.DataCategory.UNKNOWN__ : dataCategory;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DataCategory[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DataCategory[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DataCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DataCategory) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DataCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DataCategory> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
