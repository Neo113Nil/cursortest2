package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PRIMARY", "WALLET", "THUMBNAIL", "REWARD", "PAYMENT_TOKEN", "STACK_VIEW", "PARTNER", "BRAND", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstitutionImageCategory {
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory BRAND;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory PARTNER;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory PAYMENT_TOKEN;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory PRIMARY;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory REWARD;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory STACK_VIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory THUMBNAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory WALLET;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InstitutionImageCategory(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("PRIMARY", 0, "PRIMARY");
        PRIMARY = institutionImageCategory;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory2 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("WALLET", 1, "WALLET");
        WALLET = institutionImageCategory2;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory3 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("THUMBNAIL", 2, "THUMBNAIL");
        THUMBNAIL = institutionImageCategory3;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory4 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("REWARD", 3, "REWARD");
        REWARD = institutionImageCategory4;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory5 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("PAYMENT_TOKEN", 4, "PAYMENT_TOKEN");
        PAYMENT_TOKEN = institutionImageCategory5;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory6 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("STACK_VIEW", 5, "STACK_VIEW");
        STACK_VIEW = institutionImageCategory6;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory7 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("PARTNER", 6, "PARTNER");
        PARTNER = institutionImageCategory7;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory8 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("BRAND", 7, "BRAND");
        BRAND = institutionImageCategory8;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory9 = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = institutionImageCategory9;
        com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[] institutionImageCategoryArr = {institutionImageCategory, institutionImageCategory2, institutionImageCategory3, institutionImageCategory4, institutionImageCategory5, institutionImageCategory6, institutionImageCategory7, institutionImageCategory8, institutionImageCategory9};
        getHighResolutionOutputSizeshNQ4ISI = institutionImageCategoryArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(institutionImageCategoryArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InstitutionImageCategory", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PRIMARY", "WALLET", "THUMBNAIL", "REWARD", "PAYMENT_TOKEN", "STACK_VIEW", "PARTNER", "BRAND"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[]{com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.PRIMARY, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.WALLET, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.THUMBNAIL, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.REWARD, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.PAYMENT_TOKEN, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.STACK_VIEW, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.PARTNER, com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.BRAND});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory = (com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory) obj;
            return institutionImageCategory == null ? com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.UNKNOWN__ : institutionImageCategory;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
