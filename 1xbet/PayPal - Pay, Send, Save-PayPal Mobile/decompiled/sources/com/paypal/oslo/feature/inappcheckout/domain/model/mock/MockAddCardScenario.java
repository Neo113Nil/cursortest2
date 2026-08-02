package com.paypal.oslo.feature.inappcheckout.domain.model.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockScenario;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "fileName", "getFileName", "ADD_UPDATE_CARD_SUCCESS_CARD_MODULE_RESPONSES", "ADD_UPDATE_CARD_FAILURE_CARD_MODULE_RESPONSES"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockAddCardScenario implements com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockScenario {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario ADD_UPDATE_CARD_FAILURE_CARD_MODULE_RESPONSES;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario ADD_UPDATE_CARD_SUCCESS_CARD_MODULE_RESPONSES;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String displayName;
    private final java.lang.String fileName;

    private MockAddCardScenario(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
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
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario("ADD_UPDATE_CARD_SUCCESS_CARD_MODULE_RESPONSES", 0, "Card Module API Responses For Add and Update Card Success", "mocks/card_mocks/add_update_card_success_card_module_responses.json");
        ADD_UPDATE_CARD_SUCCESS_CARD_MODULE_RESPONSES = mockAddCardScenario;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario2 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario("ADD_UPDATE_CARD_FAILURE_CARD_MODULE_RESPONSES", 1, "Card Module API Responses For Add and Update Card Failure", "mocks/card_mocks/add_update_card_failure_card_module_responses.json");
        ADD_UPDATE_CARD_FAILURE_CARD_MODULE_RESPONSES = mockAddCardScenario2;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario[] mockAddCardScenarioArr = {mockAddCardScenario, mockAddCardScenario2};
        getHighSpeedVideoFpsRanges = mockAddCardScenarioArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(mockAddCardScenarioArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
