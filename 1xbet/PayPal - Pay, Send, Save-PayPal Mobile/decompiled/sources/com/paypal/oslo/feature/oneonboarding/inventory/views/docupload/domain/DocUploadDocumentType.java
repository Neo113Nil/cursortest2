package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadDocumentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SSN", com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS, "DRIVERS_LICENSE", "PROOF_OF_NAME", "PROOF_OF_ID", "PROOF_OF_ADDRESS", "UTILITIES_BILL", "PHONE_BILL", "STATE_ID_CARD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DocUploadDocumentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType DRIVERS_LICENSE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType PASSPORT;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType PHONE_BILL;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType PROOF_OF_ADDRESS;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType PROOF_OF_ID;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType PROOF_OF_NAME;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType SSN;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType STATE_ID_CARD;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType UNKNOWN__;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType UTILITIES_BILL;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadDocumentType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadDocumentType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DocUploadDocumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("SSN", 0);
        SSN = docUploadDocumentType;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType(com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS, 1);
        PASSPORT = docUploadDocumentType2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("DRIVERS_LICENSE", 2);
        DRIVERS_LICENSE = docUploadDocumentType3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType4 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("PROOF_OF_NAME", 3);
        PROOF_OF_NAME = docUploadDocumentType4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType5 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("PROOF_OF_ID", 4);
        PROOF_OF_ID = docUploadDocumentType5;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType6 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("PROOF_OF_ADDRESS", 5);
        PROOF_OF_ADDRESS = docUploadDocumentType6;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType7 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("UTILITIES_BILL", 6);
        UTILITIES_BILL = docUploadDocumentType7;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType8 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("PHONE_BILL", 7);
        PHONE_BILL = docUploadDocumentType8;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType9 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("STATE_ID_CARD", 8);
        STATE_ID_CARD = docUploadDocumentType9;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType docUploadDocumentType10 = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType("UNKNOWN__", 9);
        UNKNOWN__ = docUploadDocumentType10;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType[] docUploadDocumentTypeArr = {docUploadDocumentType, docUploadDocumentType2, docUploadDocumentType3, docUploadDocumentType4, docUploadDocumentType5, docUploadDocumentType6, docUploadDocumentType7, docUploadDocumentType8, docUploadDocumentType9, docUploadDocumentType10};
        $VALUES = docUploadDocumentTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(docUploadDocumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType", com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType> getEntries() {
        return $ENTRIES;
    }
}
