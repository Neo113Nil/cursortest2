package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PROOF_OF_NAME_AND_DATE_OF_BIRTH", "PROOF_OF_SSN", "POA", "PROOF_OF_ADDRESS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DocUploadCategory {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory POA;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory PROOF_OF_ADDRESS;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory PROOF_OF_NAME_AND_DATE_OF_BIRTH;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory PROOF_OF_SSN;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory UNKNOWN__;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCategory$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DocUploadCategory(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory docUploadCategory = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory("PROOF_OF_NAME_AND_DATE_OF_BIRTH", 0);
        PROOF_OF_NAME_AND_DATE_OF_BIRTH = docUploadCategory;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory docUploadCategory2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory("PROOF_OF_SSN", 1);
        PROOF_OF_SSN = docUploadCategory2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory docUploadCategory3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory("POA", 2);
        POA = docUploadCategory3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory docUploadCategory4 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory("PROOF_OF_ADDRESS", 3);
        PROOF_OF_ADDRESS = docUploadCategory4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory docUploadCategory5 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory("UNKNOWN__", 4);
        UNKNOWN__ = docUploadCategory5;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory[] docUploadCategoryArr = {docUploadCategory, docUploadCategory2, docUploadCategory3, docUploadCategory4, docUploadCategory5};
        $VALUES = docUploadCategoryArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(docUploadCategoryArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory", com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory> getEntries() {
        return $ENTRIES;
    }
}
