package com.paypal.oslo.feature.inappcheckout.domain.model.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockScenario;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "fileName", "getFileName", "VALID_AUTH_RESPONSE", "VALID_AUTH_RESPONSE_WITH_SINGLE_FI", "VALID_AUTH_RESPONSE_WITH_ADD_CARD_CONTINGENCY", "VALID_AUTH_RESPONSE_WITH_COBRANDING", "BUYER_RESTRICTION_ERROR", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "HIGH_ACH_FRAUD_RISK_ERROR", "VALID_AUTH_RESPONSE_WITH_PRE_AUTH_CONTINGENCY", "VALID_AUTH_RESPONSE_WITH_RESELECT_FI", "CONTINGENCY_E_CONSENT", "INSTANT_VAULT", "INSTANT_VAULT_WITH_BALANCE", "INSTANT_VAULT_USER_EXPERIENCE_DETAILS_NULL", "VALID_AUTH_RESPONSE_WITH_CIT_AUTH", "VALID_AUTH_RESPONSE_WITH_THREE_DS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockAuthScenario implements com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockScenario {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario BUYER_RESTRICTION_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario CONTINGENCY_E_CONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario HIGH_ACH_FRAUD_RISK_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario INSTANT_VAULT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario INSTANT_VAULT_USER_EXPERIENCE_DETAILS_NULL;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario INSTANT_VAULT_WITH_BALANCE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario INTERNAL_SERVER_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_ADD_CARD_CONTINGENCY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_CIT_AUTH;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_COBRANDING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_PRE_AUTH_CONTINGENCY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_RESELECT_FI;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_SINGLE_FI;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario VALID_AUTH_RESPONSE_WITH_THREE_DS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String displayName;
    private final java.lang.String fileName;

    private MockAuthScenario(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.displayName = str2;
        this.fileName = str3;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockScenario
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockScenario
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE", 0, "Valid Auth Response", "mocks/ryp_mocks/valid_auth_response.json");
        VALID_AUTH_RESPONSE = mockAuthScenario;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario2 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_SINGLE_FI", 1, "Valid Auth Response - Single Fi", "mocks/ryp_mocks/valid_auth_response_with_single_fi.json");
        VALID_AUTH_RESPONSE_WITH_SINGLE_FI = mockAuthScenario2;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario3 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_ADD_CARD_CONTINGENCY", 2, "Add Card Contingency Response", "mocks/ryp_mocks/valid_auth_response_with_add_card_contingency.json");
        VALID_AUTH_RESPONSE_WITH_ADD_CARD_CONTINGENCY = mockAuthScenario3;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario4 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_COBRANDING", 3, "Valid Auth Response with Co-Branding", "mocks/ryp_mocks/valid_auth_response_with_paypal_cobranding.json");
        VALID_AUTH_RESPONSE_WITH_COBRANDING = mockAuthScenario4;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario5 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("BUYER_RESTRICTION_ERROR", 4, "Buyer Restriction Error Response", "mocks/ryp_mocks/buyer_restriction_error_response.json");
        BUYER_RESTRICTION_ERROR = mockAuthScenario5;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario6 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, 5, "Internal Server Error (Recoverable)", "mocks/ryp_mocks/internal_server_error_response.json");
        INTERNAL_SERVER_ERROR = mockAuthScenario6;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario7 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("HIGH_ACH_FRAUD_RISK_ERROR", 6, "Non-Recoverable Error", "mocks/ryp_mocks/high_ach_fraud_risk_error_response.json");
        HIGH_ACH_FRAUD_RISK_ERROR = mockAuthScenario7;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario8 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_PRE_AUTH_CONTINGENCY", 7, "Pre-Auth (Smart Auth) Contingency", "mocks/ryp_mocks/valid_auth_response_with_pre_auth_contingency.json");
        VALID_AUTH_RESPONSE_WITH_PRE_AUTH_CONTINGENCY = mockAuthScenario8;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario9 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_RESELECT_FI", 8, "Reselect FI Scenario (CC-RESELECT6767)", "mocks/ryp_mocks/valid_auth_response_with_reselect_fi.json");
        VALID_AUTH_RESPONSE_WITH_RESELECT_FI = mockAuthScenario9;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario10 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("CONTINGENCY_E_CONSENT", 9, "Auth Response with E-Consent Contingency", "mocks/ryp_mocks/valid_auth_response_with_e_consent_required.json");
        CONTINGENCY_E_CONSENT = mockAuthScenario10;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario11 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("INSTANT_VAULT", 10, "Instant Vault", "mocks/ryp_mocks/valid_auth_response_with_instant_vault.json");
        INSTANT_VAULT = mockAuthScenario11;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario12 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("INSTANT_VAULT_WITH_BALANCE", 11, "Instant Vault - With Balance", "mocks/ryp_mocks/valid_auth_response_with_instant_vault_with_balance.json");
        INSTANT_VAULT_WITH_BALANCE = mockAuthScenario12;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario13 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("INSTANT_VAULT_USER_EXPERIENCE_DETAILS_NULL", 12, "Instant Vault - UserExperienceDetails Null", "mocks/ryp_mocks/valid_auth_response_with_instant_vault_with_user_experience_details_null.json");
        INSTANT_VAULT_USER_EXPERIENCE_DETAILS_NULL = mockAuthScenario13;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario14 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_CIT_AUTH", 13, "CIT Auth Scenario (CC-CITAUTH4242)", "mocks/ryp_mocks/valid_auth_response_with_cit_auth.json");
        VALID_AUTH_RESPONSE_WITH_CIT_AUTH = mockAuthScenario14;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario15 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario("VALID_AUTH_RESPONSE_WITH_THREE_DS", 14, "THREE DS Scenario (CC-THREEDS4242)", "mocks/ryp_mocks/valid_auth_response_with_three_ds.json");
        VALID_AUTH_RESPONSE_WITH_THREE_DS = mockAuthScenario15;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario[] mockAuthScenarioArr = {mockAuthScenario, mockAuthScenario2, mockAuthScenario3, mockAuthScenario4, mockAuthScenario5, mockAuthScenario6, mockAuthScenario7, mockAuthScenario8, mockAuthScenario9, mockAuthScenario10, mockAuthScenario11, mockAuthScenario12, mockAuthScenario13, mockAuthScenario14, mockAuthScenario15};
        getHighSpeedVideoFpsRangesFor = mockAuthScenarioArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(mockAuthScenarioArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
