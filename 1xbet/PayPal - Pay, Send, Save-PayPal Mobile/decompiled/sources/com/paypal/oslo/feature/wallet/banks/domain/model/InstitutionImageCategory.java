package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PRIMARY", "WALLET", "THUMBNAIL", "REWARD", "PAYMENT_TOKEN", "STACK_VIEW", "PARTNER", "BRAND", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class InstitutionImageCategory {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory BRAND;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory PARTNER;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory PAYMENT_TOKEN;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory PRIMARY;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory REWARD;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory STACK_VIEW;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory THUMBNAIL;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory WALLET;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InstitutionImageCategory(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("PRIMARY", 0);
        PRIMARY = institutionImageCategory;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory2 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("WALLET", 1);
        WALLET = institutionImageCategory2;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory3 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("THUMBNAIL", 2);
        THUMBNAIL = institutionImageCategory3;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory4 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("REWARD", 3);
        REWARD = institutionImageCategory4;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory5 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("PAYMENT_TOKEN", 4);
        PAYMENT_TOKEN = institutionImageCategory5;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory6 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("STACK_VIEW", 5);
        STACK_VIEW = institutionImageCategory6;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory7 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("PARTNER", 6);
        PARTNER = institutionImageCategory7;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory8 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("BRAND", 7);
        BRAND = institutionImageCategory8;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory institutionImageCategory9 = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory("UNKNOWN", 8);
        UNKNOWN = institutionImageCategory9;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory[] institutionImageCategoryArr = {institutionImageCategory, institutionImageCategory2, institutionImageCategory3, institutionImageCategory4, institutionImageCategory5, institutionImageCategory6, institutionImageCategory7, institutionImageCategory8, institutionImageCategory9};
        $VALUES = institutionImageCategoryArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(institutionImageCategoryArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory", com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory> getEntries() {
        return $ENTRIES;
    }
}
