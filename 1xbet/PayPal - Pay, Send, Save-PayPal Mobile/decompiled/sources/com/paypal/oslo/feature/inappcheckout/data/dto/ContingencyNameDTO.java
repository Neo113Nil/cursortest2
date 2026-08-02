package com.paypal.oslo.feature.inappcheckout.data.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyNameDTO;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ADD_INSTRUMENT", "AUTH_CHALLENGE", "CIT_AUTH", "RESELECT_FUNDING_INSTRUMENT", "PRE_AUTH_REQUIRED", "PRE_AUTHORIZATION_REQUIRED", "UPDATE_CARD_INSTRUMENT", "ECONSENT", "THREE_DS_AUTHENTICATION_REQUIRED", "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED", "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", "BANK_ACCOUNT_BALANCE_REQUIRED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTOSerializer.class)
/* loaded from: classes2.dex */
public final class ContingencyNameDTO {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO[] $VALUES;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO ADD_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO AUTH_CHALLENGE;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO BANK_ACCOUNT_BALANCE_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO CIT_AUTH;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO ECONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO PRE_AUTHORIZATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO PRE_AUTH_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO RESELECT_FUNDING_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO THREE_DS_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO UPDATE_CARD_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyNameDTO$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyNameDTO;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO> serializer() {
            return com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTOSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ContingencyNameDTO(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("ADD_INSTRUMENT", 0);
        ADD_INSTRUMENT = contingencyNameDTO;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO2 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("AUTH_CHALLENGE", 1);
        AUTH_CHALLENGE = contingencyNameDTO2;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO3 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("CIT_AUTH", 2);
        CIT_AUTH = contingencyNameDTO3;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO4 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("RESELECT_FUNDING_INSTRUMENT", 3);
        RESELECT_FUNDING_INSTRUMENT = contingencyNameDTO4;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO5 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("PRE_AUTH_REQUIRED", 4);
        PRE_AUTH_REQUIRED = contingencyNameDTO5;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO6 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("PRE_AUTHORIZATION_REQUIRED", 5);
        PRE_AUTHORIZATION_REQUIRED = contingencyNameDTO6;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO7 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("UPDATE_CARD_INSTRUMENT", 6);
        UPDATE_CARD_INSTRUMENT = contingencyNameDTO7;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO8 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("ECONSENT", 7);
        ECONSENT = contingencyNameDTO8;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO9 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("THREE_DS_AUTHENTICATION_REQUIRED", 8);
        THREE_DS_AUTHENTICATION_REQUIRED = contingencyNameDTO9;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO10 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED", 9);
        USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED = contingencyNameDTO10;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO11 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", 10);
        USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED = contingencyNameDTO11;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO12 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("BANK_ACCOUNT_BALANCE_REQUIRED", 11);
        BANK_ACCOUNT_BALANCE_REQUIRED = contingencyNameDTO12;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO contingencyNameDTO13 = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO("UNKNOWN", 12);
        UNKNOWN = contingencyNameDTO13;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO[] contingencyNameDTOArr = {contingencyNameDTO, contingencyNameDTO2, contingencyNameDTO3, contingencyNameDTO4, contingencyNameDTO5, contingencyNameDTO6, contingencyNameDTO7, contingencyNameDTO8, contingencyNameDTO9, contingencyNameDTO10, contingencyNameDTO11, contingencyNameDTO12, contingencyNameDTO13};
        $VALUES = contingencyNameDTOArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(contingencyNameDTOArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.Companion(null);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO[] values() {
        return (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO> getEntries() {
        return $ENTRIES;
    }
}
