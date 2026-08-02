package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/PayLaterHubMockScenario;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ACTIVE_PLANS_PARTIAL_ERROR", "NO_ACTIVE_PLANS_HISTORY_PARTIAL_ERROR", "ACTIVE_PLANS_WITH_HISTORY_PARTIAL_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubMockScenario {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario ACTIVE_PLANS_PARTIAL_ERROR;
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario ACTIVE_PLANS_WITH_HISTORY_PARTIAL_ERROR;
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario NO_ACTIVE_PLANS_HISTORY_PARTIAL_ERROR;
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario SUCCESS;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PayLaterHubMockScenario(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario payLaterHubMockScenario = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario("SUCCESS", 0);
        SUCCESS = payLaterHubMockScenario;
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario payLaterHubMockScenario2 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario("ACTIVE_PLANS_PARTIAL_ERROR", 1);
        ACTIVE_PLANS_PARTIAL_ERROR = payLaterHubMockScenario2;
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario payLaterHubMockScenario3 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario("NO_ACTIVE_PLANS_HISTORY_PARTIAL_ERROR", 2);
        NO_ACTIVE_PLANS_HISTORY_PARTIAL_ERROR = payLaterHubMockScenario3;
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario payLaterHubMockScenario4 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario("ACTIVE_PLANS_WITH_HISTORY_PARTIAL_ERROR", 3);
        ACTIVE_PLANS_WITH_HISTORY_PARTIAL_ERROR = payLaterHubMockScenario4;
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario[] payLaterHubMockScenarioArr = {payLaterHubMockScenario, payLaterHubMockScenario2, payLaterHubMockScenario3, payLaterHubMockScenario4};
        getHighResolutionOutputSizeshNQ4ISI = payLaterHubMockScenarioArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(payLaterHubMockScenarioArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario[] values() {
        return (com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
