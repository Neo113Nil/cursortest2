package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PROOF_OF_NAME_AND_DATE_OF_BIRTH", "PROOF_OF_SSN", "POA", "PROOF_OF_ADDRESS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardDocumentCategory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory POA;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory PROOF_OF_ADDRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory PROOF_OF_NAME_AND_DATE_OF_BIRTH;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory PROOF_OF_SSN;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private OnboardDocumentCategory(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory = new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory("PROOF_OF_NAME_AND_DATE_OF_BIRTH", 0, "PROOF_OF_NAME_AND_DATE_OF_BIRTH");
        PROOF_OF_NAME_AND_DATE_OF_BIRTH = onboardDocumentCategory;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory2 = new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory("PROOF_OF_SSN", 1, "PROOF_OF_SSN");
        PROOF_OF_SSN = onboardDocumentCategory2;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory3 = new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory("POA", 2, "POA");
        POA = onboardDocumentCategory3;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory4 = new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory("PROOF_OF_ADDRESS", 3, "PROOF_OF_ADDRESS");
        PROOF_OF_ADDRESS = onboardDocumentCategory4;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory5 = new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = onboardDocumentCategory5;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[] onboardDocumentCategoryArr = {onboardDocumentCategory, onboardDocumentCategory2, onboardDocumentCategory3, onboardDocumentCategory4, onboardDocumentCategory5};
        getHighSpeedVideoFpsRanges = onboardDocumentCategoryArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(onboardDocumentCategoryArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("OnboardDocumentCategory", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PROOF_OF_NAME_AND_DATE_OF_BIRTH", "PROOF_OF_SSN", "POA", "PROOF_OF_ADDRESS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[]{com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_NAME_AND_DATE_OF_BIRTH, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_SSN, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.POA, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.PROOF_OF_ADDRESS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory = (com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory) obj;
            return onboardDocumentCategory == null ? com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.UNKNOWN__ : onboardDocumentCategory;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
