package com.paypal.oslo.feature.inappcheckout.domain.model.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockScenario;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "fileName", "getFileName", "VALID_CTA_RESPONSE", "CONTINGENCY_RESELECT_FI", "CONTINGENCY_ADD_CARD", "CONTINGENCY_UPDATE_CARD", "CONTINGENCY_ECONSENT", "CONTINGENCY_UNKNOWN", "ERROR_CTA_RESPONSE", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "CONTINGENCY_CIT_AUTH", "CONTINGENCY_THREE_DS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockCtaScenario implements com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockScenario {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_ADD_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_CIT_AUTH;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_ECONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_RESELECT_FI;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_THREE_DS;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario CONTINGENCY_UPDATE_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario ERROR_CTA_RESPONSE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario INTERNAL_SERVER_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario VALID_CTA_RESPONSE;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String displayName;
    private final java.lang.String fileName;

    private MockCtaScenario(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
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
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("VALID_CTA_RESPONSE", 0, "Valid CTA Response", "mocks/cta_mocks/cta_response_success.json");
        VALID_CTA_RESPONSE = mockCtaScenario;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario2 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_RESELECT_FI", 1, "Reselect Fi Contingency", "mocks/cta_mocks/cta_response_contingency_reselect_fi.json");
        CONTINGENCY_RESELECT_FI = mockCtaScenario2;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario3 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_ADD_CARD", 2, "Add Card Contingency", "mocks/cta_mocks/cta_response_contingency_add_card.json");
        CONTINGENCY_ADD_CARD = mockCtaScenario3;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario4 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_UPDATE_CARD", 3, "Update Card Contingency", "mocks/cta_mocks/cta_response_contingency_update_card.json");
        CONTINGENCY_UPDATE_CARD = mockCtaScenario4;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario5 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_ECONSENT", 4, "E-Consent Contingency", "mocks/cta_mocks/cta_response_contingency_econsent.json");
        CONTINGENCY_ECONSENT = mockCtaScenario5;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario6 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_UNKNOWN", 5, "Unknown Contingency", "mocks/cta_mocks/cta_response_unknown_contingency.json");
        CONTINGENCY_UNKNOWN = mockCtaScenario6;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario7 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("ERROR_CTA_RESPONSE", 6, "Error CTA Response", "mocks/cta_mocks/cta_response_error.json");
        ERROR_CTA_RESPONSE = mockCtaScenario7;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario8 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, 7, "Internal Server Error(Recoverable)", "mocks/cta_mocks/cta_response_internal_server_error.json");
        INTERNAL_SERVER_ERROR = mockCtaScenario8;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario9 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_CIT_AUTH", 8, "CIT Auth Contingency", "mocks/cta_mocks/cta_response_contingency_cit_auth.json");
        CONTINGENCY_CIT_AUTH = mockCtaScenario9;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario10 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario("CONTINGENCY_THREE_DS", 9, "THREE DS Contingency", "mocks/cta_mocks/cta_response_contingency_three_ds.json");
        CONTINGENCY_THREE_DS = mockCtaScenario10;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario[] mockCtaScenarioArr = {mockCtaScenario, mockCtaScenario2, mockCtaScenario3, mockCtaScenario4, mockCtaScenario5, mockCtaScenario6, mockCtaScenario7, mockCtaScenario8, mockCtaScenario9, mockCtaScenario10};
        getHighResolutionOutputSizeshNQ4ISI = mockCtaScenarioArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(mockCtaScenarioArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
