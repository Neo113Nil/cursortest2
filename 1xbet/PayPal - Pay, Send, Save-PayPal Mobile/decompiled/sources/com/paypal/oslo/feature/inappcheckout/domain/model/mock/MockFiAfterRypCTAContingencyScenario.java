package com.paypal.oslo.feature.inappcheckout.domain.model.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "fileName", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY", "SINGLE_FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY", "FI_AFTER_ADD_CARD_CONTINGENCY", "FI_AFTER_RESELECT_FI_WITH_DISALLOWED", "FI_AFTER_CIT_AUTH_WITH_DISALLOWED", "FI_AFTER_THREE_DS_WITH_DISALLOWED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockFiAfterRypCTAContingencyScenario {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario FI_AFTER_ADD_CARD_CONTINGENCY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario FI_AFTER_CIT_AUTH_WITH_DISALLOWED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario FI_AFTER_RESELECT_FI_WITH_DISALLOWED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario FI_AFTER_THREE_DS_WITH_DISALLOWED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario SINGLE_FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario[] getHighSpeedVideoSizes;
    private final java.lang.String fileName;

    private MockFiAfterRypCTAContingencyScenario(java.lang.String str, int i, java.lang.String str2) {
        this.fileName = str2;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario("FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY", 0, "mocks/fi_mocks_on_ryp_cta_contingency/fi_response_on_reselect_fi_contingency.json");
        FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY = mockFiAfterRypCTAContingencyScenario;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario2 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario("SINGLE_FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY", 1, "mocks/fi_mocks_on_ryp_cta_contingency/single_fi_response_on_reselect_fi_contingency.json");
        SINGLE_FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY = mockFiAfterRypCTAContingencyScenario2;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario3 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario("FI_AFTER_ADD_CARD_CONTINGENCY", 2, "mocks/fi_mocks_on_ryp_cta_contingency/fi_response_on_add_card_contingency.json");
        FI_AFTER_ADD_CARD_CONTINGENCY = mockFiAfterRypCTAContingencyScenario3;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario4 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario("FI_AFTER_RESELECT_FI_WITH_DISALLOWED", 3, "mocks/fi_mocks_on_ryp_cta_contingency/fi_response_after_reselect_fi_with_disallowed.json");
        FI_AFTER_RESELECT_FI_WITH_DISALLOWED = mockFiAfterRypCTAContingencyScenario4;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario5 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario("FI_AFTER_CIT_AUTH_WITH_DISALLOWED", 4, "mocks/fi_mocks_on_ryp_cta_contingency/fi_response_after_cit_auth_with_disallowed.json");
        FI_AFTER_CIT_AUTH_WITH_DISALLOWED = mockFiAfterRypCTAContingencyScenario5;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario6 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario("FI_AFTER_THREE_DS_WITH_DISALLOWED", 5, "mocks/fi_mocks_on_ryp_cta_contingency/fi_response_after_three_ds_with_disallowed.json");
        FI_AFTER_THREE_DS_WITH_DISALLOWED = mockFiAfterRypCTAContingencyScenario6;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario[] mockFiAfterRypCTAContingencyScenarioArr = {mockFiAfterRypCTAContingencyScenario, mockFiAfterRypCTAContingencyScenario2, mockFiAfterRypCTAContingencyScenario3, mockFiAfterRypCTAContingencyScenario4, mockFiAfterRypCTAContingencyScenario5, mockFiAfterRypCTAContingencyScenario6};
        getHighSpeedVideoSizes = mockFiAfterRypCTAContingencyScenarioArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(mockFiAfterRypCTAContingencyScenarioArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
