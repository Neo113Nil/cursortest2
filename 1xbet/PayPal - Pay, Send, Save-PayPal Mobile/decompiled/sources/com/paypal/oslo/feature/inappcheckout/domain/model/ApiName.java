package com.paypal.oslo.feature.inappcheckout.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PRE_RENDER", "ECONSENT", "FUNDING_SELECTION", "AUTHORIZE_BILLING_AGREEMENT_CREATION", "BUYER_INFO", "CARD_FORM_DATA", "ADD_CARD", "UPDATE_CARD", "MFS_METADATA", "MFS_CARD_DETECTION", "AUTODETECT_CARDS"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes13.dex */
public final class ApiName {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.ApiName[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName ADD_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName AUTHORIZE_BILLING_AGREEMENT_CREATION;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName AUTODETECT_CARDS;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName BUYER_INFO;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName CARD_FORM_DATA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName ECONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName FUNDING_SELECTION;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName MFS_CARD_DETECTION;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName MFS_METADATA;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName PRE_RENDER;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName UPDATE_CARD;
    private final java.lang.String rawValue;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.model.ApiName> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ApiName(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("PRE_RENDER", 0, "preRender");
        PRE_RENDER = apiName;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName2 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("ECONSENT", 1, "eConsent");
        ECONSENT = apiName2;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName3 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("FUNDING_SELECTION", 2, "fundingSelection");
        FUNDING_SELECTION = apiName3;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName4 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("AUTHORIZE_BILLING_AGREEMENT_CREATION", 3, "authorizeBillingAgreementCreation");
        AUTHORIZE_BILLING_AGREEMENT_CREATION = apiName4;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName5 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("BUYER_INFO", 4, "buyerInfo");
        BUYER_INFO = apiName5;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName6 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("CARD_FORM_DATA", 5, "cardFormData");
        CARD_FORM_DATA = apiName6;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName7 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("ADD_CARD", 6, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME);
        ADD_CARD = apiName7;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName8 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("UPDATE_CARD", 7, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OPERATION_NAME);
        UPDATE_CARD = apiName8;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName9 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("MFS_METADATA", 8, "mfsMetadata");
        MFS_METADATA = apiName9;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName10 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("MFS_CARD_DETECTION", 9, "mfsCardDetection");
        MFS_CARD_DETECTION = apiName10;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName11 = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName("AUTODETECT_CARDS", 10, "autodetectCards");
        AUTODETECT_CARDS = apiName11;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName[] apiNameArr = {apiName, apiName2, apiName3, apiName4, apiName5, apiName6, apiName7, apiName8, apiName9, apiName10, apiName11};
        $VALUES = apiNameArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(apiNameArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.model.ApiName$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.inappcheckout.domain.model.ApiName", com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.ApiName[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.ApiName[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.ApiName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.ApiName) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.ApiName> getEntries() {
        return $ENTRIES;
    }
}
