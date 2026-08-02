package com.paypal.oslo.feature.inappcheckout.domain.model.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockScenario;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "fileName", "getFileName", "VALID_RESPONSE", "VALID_RESPONSE_WITH_RESELECT_FI", "BUYER_RESTRICTION_ERROR", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockInitializeNativeRypCheckoutScenario implements com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockScenario {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario BUYER_RESTRICTION_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario INTERNAL_SERVER_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario VALID_RESPONSE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario VALID_RESPONSE_WITH_RESELECT_FI;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String displayName;
    private final java.lang.String fileName;

    private MockInitializeNativeRypCheckoutScenario(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
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
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario("VALID_RESPONSE", 0, "Valid Response", "mocks/initialize_native_ryp_checkout_mocks/valid_initialize_native_ryp_checkout_response.json");
        VALID_RESPONSE = mockInitializeNativeRypCheckoutScenario;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario2 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario("VALID_RESPONSE_WITH_RESELECT_FI", 1, "Valid Response with Reselect FI", "mocks/initialize_native_ryp_checkout_mocks/valid_initialize_native_ryp_checkout_response_with_reselect_fi.json");
        VALID_RESPONSE_WITH_RESELECT_FI = mockInitializeNativeRypCheckoutScenario2;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario3 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario("BUYER_RESTRICTION_ERROR", 2, "Buyer Restriction Error", "mocks/initialize_native_ryp_checkout_mocks/buyer_restriction_error_response.json");
        BUYER_RESTRICTION_ERROR = mockInitializeNativeRypCheckoutScenario3;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario4 = new com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, 3, "Internal Server Error (Recoverable)", "mocks/initialize_native_ryp_checkout_mocks/internal_server_error_response.json");
        INTERNAL_SERVER_ERROR = mockInitializeNativeRypCheckoutScenario4;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario[] mockInitializeNativeRypCheckoutScenarioArr = {mockInitializeNativeRypCheckoutScenario, mockInitializeNativeRypCheckoutScenario2, mockInitializeNativeRypCheckoutScenario3, mockInitializeNativeRypCheckoutScenario4};
        getHighResolutionOutputSizeshNQ4ISI = mockInitializeNativeRypCheckoutScenarioArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(mockInitializeNativeRypCheckoutScenarioArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
